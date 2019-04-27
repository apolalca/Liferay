# Friendly URL
This is a story of two URLs who couldn’t be more different. One was full of himself, and always wanted to show everyone (users and SEO services alike) just how smart he was, by openly displaying all of the parameters he carried. He was happiest when he met new people and could tell they were intimidated and confused by him.

``` 
http://localhost:8080/group/guest/~/control_panel/manage?p_p_id=com_liferay_blogs_web_portlet_BlogsAdminPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&_com_liferay_blogs_web_portlet_BlogsAdminPortlet_mvcRenderCommandName=%2Fblogs%2Fedit_entry&_com_liferay_blogs_web_portlet_BlogsAdminPortlet_redirect=http%3A%2F%2Flocalhost%3A8080%2Fgroup%2Fguest%2F~%2Fcontrol_panel%2Fmanage%3Fp_p_id%3Dcom_liferay_blogs_web_portlet_BlogsAdminPortlet%26p_p_lifecycle%3D0%26p_p_state%3Dmaximized%26p_p_mode%3Dview%26_com_liferay_blogs_web_portlet_BlogsAdminPortlet_mvcRenderCommandName%3D%252Fblogs%252Fview%26_com_liferay_blogs_web_portlet_BlogsAdminPortlet_orderBycol%3Dtitle%26_com_liferay_blogs_web_portlet_BlogsAdminPortlet_orderByType%3Dasc%26_com_liferay_blogs_web_portlet_BlogsAdminPortlet_entriesNavigation%3D%26_com_liferay_blogs_web_portlet_BlogsAdminPortlet_cur%3D1%26_com_liferay_blogs_web_portlet_BlogsAdminPortlet_delta%3D20&_com_liferay_blogs_web_portlet_BlogsAdminPortlet_entryId=30836
```
The other was just, well, friendly. You knew only the important things about her, because she was less concerned about looking smart, and more concerned about those she interacted with. She didn’t need to look fancy and complicated. She aspired to be simple and kind to all the users and SEO services she encountered.
```
http://localhost:8080/web/guest/home/-/blogs/lunar-scavenger-hunt
```
If you want your application to be friendly to your users and to SEO services, make your URLs friendlier. It only takes a couple steps, after all.

Lessons learned:
* No calls are made to the MVCRenderComand: Check that the `javax.portlet.name` is identical throughout the portlet and therefore accessible from the Router.
* The URL does not appear as friendly: Check that it complies with all the `routes.xml` rules, if it does not comply it will not appear as friendly.
