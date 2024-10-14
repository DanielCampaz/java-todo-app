package org.example.themes;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class CustomTheme_Light
	extends FlatMacLightLaf
{
	public static final String NAME = "CustomTheme_Light";

	public static boolean setup() {
		return setup( new CustomTheme_Light() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, CustomTheme_Light.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
