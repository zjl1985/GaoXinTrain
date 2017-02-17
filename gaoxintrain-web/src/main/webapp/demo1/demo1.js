/**
 * Created by zhang on 2017/2/17.
 */
var Demo1 = function () {
    var configMap = {
        table:null
    };

    var jqueryMap = {
        $table: null
    };

    var setJqueryMap=function () {
        $table=$('#demo_table');
    }

    var initDataTable=function () {
        configMap.table=$table.DataTable({
            dom: '<"top">rt<"bottom"><"clear">',
            deferRender: true,
            ordering: false,
            autoWidth: true,
            paging: false,
            data:[],
            columns:[
                {
                    data:'address'
                },
                {
                    data:'name'
                },
                {
                    data:'context'
                },
                {
                    data:'state'
                },
                {
                    data:'sendTime'
                }
            ]
        });
    }

    return {
        init: function () {
            setJqueryMap();
            initDataTable();
        }
    };
}();