module com.arianesline.ariane.plugin.i18n.german {
  requires com.arianesline.ariane.plugin.api;

  opens com.arianesline.ariane.plugin.i18n.german;

  provides com.arianesline.ariane.plugin.api.TranslationPlugin with
      com.arianesline.ariane.plugin.i18n.german.GermanTranslationPlugin;
}
