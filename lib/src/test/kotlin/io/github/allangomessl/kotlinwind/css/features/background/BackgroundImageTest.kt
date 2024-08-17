package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_IMAGE
import kotlin.test.Test
import kotlin.test.assertEquals

class BackgroundImageTest {

  @Test
  fun image() {
    val expected = Style(BACKGROUND_IMAGE, "url('picture')").toString()
    val returned = KW.inline { background.image["picture"] }
    assertEquals(expected, returned)
  }

  @Test
  fun image_none() {
    val expected = Style(BACKGROUND_IMAGE, "none").toString()
    val returned = KW.inline { background.image_none }
    assertEquals(expected, returned)
  }

}