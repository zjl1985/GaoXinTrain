<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2017/2/17
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container-fluid">
    <div class="row"></div>
    <div class="row">
        <div class="col-md-12">
            <table id="table" class="table table-bordered" style="width:100%;">
                <thead>
                <tr>
                    <th>1</th>
                    <th>1</th>
                    <th>1</th>
                    <th>1</th>
                    <th>1</th>
                </tr>
                </thead>
            </table>
        </div>
    </div>
</div>
<script src="<%= request.getContextPath()%>/assets/pages/scripts/messagelog/messagelog.js" type="text/javascript"></script>
<script>
    $(function () {
        MessageLog.init();
    });
</script>