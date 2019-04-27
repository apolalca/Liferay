package com.github.apolalca.sample.friendlyurl.routes;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import org.osgi.service.component.annotations.Component;

import static com.github.apolalca.sample.friendlyurl.constants.SampleFriendlyURLPortletKeys.*;

@Component(
        property = {
                "com.liferay.portlet.friendly-url-routes=META-INF/friendly-url-routes/routes.xml",
                "javax.portlet.name=" + FRIENDLY_URL_NAME
        },
        service = FriendlyURLMapper.class
)
public class SampleFriendlyURLMapper extends DefaultFriendlyURLMapper {

    @Override
    public String getMapping() {
        return FRIEND_URL_MAPPER;
    }
}
