package com.github.apolalca.sample.friendlyurl.portlet;

import com.github.apolalca.sample.friendlyurl.constants.SampleFriendlyURLPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author apolalca
 */
@Component(
	immediate = true,
		property = {
				"com.liferay.portlet.add-default-resource=true",
				"com.liferay.portlet.display-category=category.sample",
				"com.liferay.portlet.preferences-owned-by-group=true",
				"com.liferay.portlet.use-default-template=true",
				"javax.portlet.display-name=Sample FriendlyURL",
				"javax.portlet.init-param.always-display-default-configuration-icons=true",
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.name=" + SampleFriendlyURLPortletKeys.FRIENDLY_URL_NAME,
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=guest,power-user,user",
				"javax.portlet.supports.mime-type=text/html"
		},

		service = Portlet.class
)
public class SampleFriendlyURLPortlet extends MVCPortlet {
}