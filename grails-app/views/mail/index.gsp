<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'asyncmail.css', plugin: 'asynchronous-mail')}"/>
    <title>Send a new message</title>
</head>
<body>
<%-- Header --%>
<h1>Edit Asynchronous Mail Message</h1>

<%-- Navigation --%>
<div class="nav">
    <span class="menuButton"><a class="home" href="${resource(dir: '')}">Home</a></span>
    <span class="menuButton"><g:link class="list" controller="asynchronousMail" action="list">List</g:link></span>
</div>

<%-- Flash message --%>
<g:render template="/asynchronousMail/flashMessage"/>

<div class="body">
    <g:form method="post" action="send">
        <table>
            <tbody>
            <tr class="odd">
                <td class="fieldName">From:</td>
                <td><g:textField name="from"/></td>
            </tr>

            <tr class="even">
                <td class="fieldName">To:</td>
                <td><g:textField name="to"/></td>
            </tr>

            <tr class="odd">
                <td class="fieldName">Subject:</td>
                <td><g:textField name="subject"/></td>
            </tr>

            <tr class="even">
                <td class="fieldName">Body:</td>
                <td><g:textArea name="body"/></td>
            </tr>
            </tbody>
        </table>

        <div class="buttons">
            <span class="button"><g:submitButton class="save" name="Send"/></span>
        </div>
    </g:form>
</div>

</body>
</html>