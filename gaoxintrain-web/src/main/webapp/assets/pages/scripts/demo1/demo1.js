/**
 * Created by zhang on 2017/2/17.
 */
var Demo1 = function () {
    'use strict';
    var configMap = {
        table: null,
        dataUrl: '/hello/demo1/demo1',
        allDatas: []
    };

    var jqueryMap = {
        $table: null
    };

    var setJqueryMap = function () {
        jqueryMap.$table = $('#demo_table');
        jqueryMap.$btnAdd = $('#btn_add_demo1');
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
                    render: function (data, index, row) {
                        var view_context = '';
                        switch (data) {
                            case 1:
                                view_context = '成功';
                                break
                            case 2:
                                view_context = '失败';
                                break
                        }
                        return view_context;
                    }
                },
                {
                    data: 'sendTime',
                    render: function (data) {
                        return moment(data).format('YYYY-MM-DD HH:mm:ss');
                    }
                }
            ],
            drawCallback:function (){
                jqueryMap.$table.find('tbody tr').off('click').on('click',function () {
                    jqueryMap.$table.find('tbody tr.tr-select').removeClass('tr-select');
                    $(this).addClass('tr-select');

                });
            }
        });


    };

    var initTableData = function () {
        var url = configMap.dataUrl;
        $.ajax({
            url: url,
            type: 'GET',
            dataType: 'JSON',
            success: function (result) {
                if (result.length > 0) {
                    configMap.allDatas = result;
                    refData();
                }
            },
            error: function (e) {
                console.error(e);
            }
        });
    };

    var refData = function () {
        configMap.table.clear().draw();
        if (configMap.allDatas.length > 0) {
            configMap.table.rows.add(configMap.allDatas).draw();
        }
    }


    return {
        init: function () {
            setJqueryMap();
            jqueryMap.$btnAdd.off('click').on('click', function () {
                var index = configMap.allDatas.length;
                var newDemo1 = {
                    address: 'demo' + index,
                    name: 'demo' + index,
                    context: 'demo' + index,
                    state: 2,
                    sendTime: moment(),
                };
                configMap.allDatas.push(newDemo1);
                refData();
            });
            initTable();
            initTableData();
        }
    };
}();

//# sourceURL=demo1.js