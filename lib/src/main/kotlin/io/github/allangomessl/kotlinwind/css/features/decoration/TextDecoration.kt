package io.github.allangomessl.kotlinwind.css.features.decoration

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.TEXT_DECORATION_LINE

class TextDecoration(kw: KWRoot, kind: String) :
  KWScope.Scoped<TextDecoration>(kw),
  TextDecorationStyle<TextDecoration>,
  TextDecorationThickness<TextDecoration>,
  TextUnderlineOffset<TextDecoration>,
  TextDecorationColor<TextDecoration>
{

  init {
    TEXT_DECORATION_LINE value kind
  }

}