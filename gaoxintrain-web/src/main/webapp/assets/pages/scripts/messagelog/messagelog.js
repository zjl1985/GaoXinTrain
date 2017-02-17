/**
 * Created by zhang on 2017/2/17.
 */
var MessageLog = function () {
    'use strict';
    var configMap = {
        table: null,
        dataUrl: '/hello/messagelog/messagelog',
        allDatas: []
    };

    var jqueryMap = {
        $table: null
    };

    var setJqueyMap=function () {
        jqueryMap.$table = $('#table');
    };

    var initData=function () {
        $.ajax({
            type:'GET',
            url:configMap.dataUrl,
            dataType:'JSON',
            success:function (result) {
                console.log(result);
                configMap.table.clear().draw();
                configMap.table.rows.add(result).draw();
            }
        });
    }

    var initTable=function () {
        configMap.table=jqueryMap.$table.DataTable({
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
    }

    return {
        init: function () {
            setJqueyMap();
            initTable();
            initData();
        }
    };

}();