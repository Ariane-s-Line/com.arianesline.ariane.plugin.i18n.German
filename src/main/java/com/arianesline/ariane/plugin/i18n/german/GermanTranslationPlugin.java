package com.arianesline.ariane.plugin.i18n.german;

import com.arianesline.ariane.plugin.api.AbstractTranslationPlugin;
import java.util.Locale;

public class GermanTranslationPlugin extends AbstractTranslationPlugin {

  public GermanTranslationPlugin() {
    super(Locale.of("de"), "/com/arianesline/ariane/plugin/i18n/german/ui_de.properties");
  }

  @Override
  public String getName() {
    return "German Translation Plugin";
  }
}
