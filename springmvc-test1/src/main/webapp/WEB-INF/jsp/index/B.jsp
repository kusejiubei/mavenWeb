<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
         contentType="text/html;charset=UTF-8"%>
<%@ include file="../includes/includes.jsp"%>
<json:object>
    <json:object name="message">
        <json:property name="name" value="${name }" />
        <json:property name="code" value="${code }" />
        <json:property name="message" value="这是一个测试，Json Data" />
    </json:object>
</json:object>