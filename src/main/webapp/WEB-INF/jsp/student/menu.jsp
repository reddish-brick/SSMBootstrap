<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked" id="nav">
        <li><a href="${pageContext.request.contextPath}/student/showCourse.action">所有课程<span class="badge pull-right">26</span></a></li>
        <li><a href="${pageContext.request.contextPath}/student/selectedCourse.action">已选课程<span class="badge pull-right">5</span></a></li>
        <li><a href="${pageContext.request.contextPath}/student/overCourse.action">已修课程<span class="badge pull-right">8</span></a></li>
        <li><a href="${pageContext.request.contextPath}/student/passwordRest.action">修改密码<sapn class="glyphicon glyphicon-pencil pull-right" /></a></li>
        <li><a href="${pageContext.request.contextPath}/logout.action">退出系统<sapn class="glyphicon glyphicon-log-out pull-right" /></a></li>
        <li class="disabled"><a href="##">Responsive</a></li>
    </ul>
</div>