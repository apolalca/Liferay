package com.github.apolalca.sample.friendlyurl.command;

import com.github.apolalca.sample.friendlyurl.constants.SampleFriendlyURLPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + SampleFriendlyURLPortletKeys.FRIENDLY_URL_NAME,
                "mvc.command.name=/friend/view"
        },
        service = MVCRenderCommand.class
)
public class SampleViewRenderCommand implements MVCRenderCommand {

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse)  {
        return "/view.jsp";
    }
}
