#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
<%@ include file="/common/taglibs.jsp"%>
<head>
    <title><fmt:message key="personDetail.title"/></title>
    <meta name="menu" content="PersonMenu"/>
</head>
 
<div class="col-sm-3">
    <h2><fmt:message key='personDetail.heading'/></h2>
</div>
 
<div class="col-sm-7">
	<form:form commandName="person" method="post" action="personform" id="personForm" cssClass="well">
    <form:errors path="*" cssClass="alert alert-danger alert-dismissable" element="div"/>
    
    <form:hidden path="id"/>
    <spring:bind path="person.firstName">
	    <div class="form-group${symbol_dollar}{(not empty status.errorMessage) ? ' has-error' : ''}">	    
        <appfuse:label styleClass="control-label" key="person.firstName"/>
        <form:input path="firstName" id="firstName" maxlength="50" autofocus="true" cssClass="form-control"/>
        <form:errors path="firstName" cssClass="help-inline"/>
        </div>
    </spring:bind>
    
    <spring:bind path="person.lastName">
	    <div class="form-group${symbol_dollar}{(not empty status.errorMessage) ? ' has-error' : ''}">	    
        <appfuse:label styleClass="control-label" key="person.lastName"/>
        <form:input path="lastName" id="lastName" maxlength="50" cssClass="form-control"/>
        <form:errors path="lastName" cssClass="help-block"/>
        </div>
    </spring:bind>
    
    <div class="form-group form-actions">
        <button type="submit" class="btn btn-primary" name="save" onclick="bCancel=false">
            <i class="icon-ok icon-white"></i> <fmt:message key="button.save"/>
        </button>
        <c:if test="${symbol_dollar}{not empty person.id}">
          <button type="submit" class="btn btn-default" name="delete" onclick="bCancel=true;return confirmMessage(msgDelConfirm)">
              <i class="icon-trash"></i> <fmt:message key="button.delete"/>
          </button>
        </c:if>
        <button type="submit" class="btn btn-default" name="cancel" onclick="bCancel=true">
            <i class="icon-remove"></i> <fmt:message key="button.cancel"/>
        </button>
    </div>
    </form:form>
</div>
 
<v:javascript formName="person" cdata="false" dynamicJavascript="true" staticJavascript="false"/>
<script type="text/javascript" src="<c:url value='/scripts/validator.jsp'/>"></script>