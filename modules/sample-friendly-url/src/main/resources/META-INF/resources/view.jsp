<%@ include file="/init.jsp" %>

<portlet:renderURL var="noFriendURL">
    <portlet:param name="mvcRenderCommandName" value="/friend/view" />
    <portlet:param name="noneParam" value="none" />
</portlet:renderURL>

<portlet:renderURL var="friendURL">
    <portlet:param name="mvcRenderCommandName" value="/friend/view" />
    <portlet:param name="friendId" value="1111" />
</portlet:renderURL>

<div>
    <p>
        <b><liferay-ui:message key="samplefriendlyurl.caption"/></b>
    </p>
    <div>
        <ul>
            <li>No Friend URL: ${noFriendURL}</li>
            <li>Friend URL: ${friendURL}</li>
        </ul>
    </div>
</div>
