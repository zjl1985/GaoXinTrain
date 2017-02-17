/**
 * Created by zhang on 2017/2/17.
 */
var Demo1 = function () {
    'use strict';
    var configMap = {
        table: null,
        dataUrl: '/hello/demo1/demo1'
    };

    var jqueryMap = {
        $table: null
    };

    var setJqueryMap = function () {
        jqueryMap.$table = $('#demo_table');
    };


    var initTable = function () {
        configMap.table = jqueryMap.$table.DataTable({
            dom: '<"top">rt<"bottom"><"clear">',
            deferRender: true,
            ordering: false,
            autoWidth: true,
            paging: false,
            data: [],
            columns: [
                {
                    data: 'address'
                },
                {
                    data: 'name'
                },
                {
                    data: 'context'
                },
                {
                    data: 'state',
                    render:function (data,index,row) {
                        var view_context='';
                        switch (data){
                            case 1:
                                view_context='成功';
                                break
                            case 2:
                                view_context='失败';
                                break
                        }
                        return view_context;
                    }
                },
                {
                    data: 'sendTime',
                    render:function (data) {
                        return moment(data).format('YYYY-MM-DD HH:mm:ss');
                    }
                }
            ]
        });
    };

    var initTableData = function () {
        var url = configMap.dataUrl;
        $.ajax({
            url: url,
            type: 'GET',
            dataType: 'JSON',
            success: function (result) {
                configMap.table.clear().draw();
                if (result.length > 0) {
                    configMap.table.rows.add(result).draw();
                }
            },
            error: function (e) {
                console.error(e);
            }
        });
    };

    return {
        init: function () {
            console.log('init');
            setJqueryMap();
            initTable();
            initTableData();
        }
    };
}();

//# sourceURL=demo1.js