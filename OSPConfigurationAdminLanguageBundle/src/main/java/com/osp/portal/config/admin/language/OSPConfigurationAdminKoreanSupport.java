package com.osp.portal.config.admin.language;

import com.osp.portal.config.admin.language.OSPConfigurationAdminKoreanSupport;

import java.util.Enumeration;
import java.util.ResourceBundle;

import com.liferay.portal.kernel.language.UTF8Control;


import org.osgi.service.component.annotations.Component;

/**
 * @author DELL
 */
@Component(
		immediate = true,
		property = {
			"language.id=ko_KR"
		},
		service = ResourceBundle.class
	)
	public class OSPConfigurationAdminKoreanSupport extends ResourceBundle {
		private ResourceBundle _resourceBundle = 
				ResourceBundle.getBundle("content.Language_ko_KR", UTF8Control.INSTANCE );

		@Override
		protected Object handleGetObject(String key) {
			System.out.println("----------------- KEY -------------------");
			System.out.println("Language Key: "+key);
			System.out.println("Language: "+(String)this._resourceBundle.getObject( key ) );
			if( key.equalsIgnoreCase("category.page-fragments") )
				System.out.println("Language Key: "+key);
			
			return this._resourceBundle.getObject( key );
		}

		@Override
		public Enumeration<String> getKeys() {
			return this._resourceBundle.getKeys();
		}

	}