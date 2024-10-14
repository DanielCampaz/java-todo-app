package org.example.themes;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class CustomTheme_Dark
	extends FlatMacDarkLaf
{
	public static final String NAME = "CustomTheme_Dark";

	public static boolean setup() {
		return setup( new CustomTheme_Dark() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, CustomTheme_Dark.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
