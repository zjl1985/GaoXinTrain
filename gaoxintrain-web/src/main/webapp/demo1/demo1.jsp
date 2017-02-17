<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2017/2/17
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped table-bordered table-hover" style="width: 100%" id="demo_table">
                <thead>
                <tr>
                    <th>发送地址</th>
                    <th>姓名</th>
                    <th>信息</th>
                    <th>状态</th>
                    <th>时间</th>
                </tr>

                </thead>
            </table>
        </div>
    </div>
</div>

<script src="<%= request.getContextPath()%>/assets/pages/scripts/demo1/demo1.js" type="text/javascript"></script>
<script>
    $(function () {
        Demo1.init();
    });
</script>