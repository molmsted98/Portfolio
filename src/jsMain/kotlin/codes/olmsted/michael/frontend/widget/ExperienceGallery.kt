package codes.olmsted.michael.frontend.widget

import dev.fritz2.dom.html.RenderContext

fun RenderContext.experienceImages(
    imageUris: List<String>,
) {
    div("experience-gallery") {
        div("thumbnails") {
            imageUris.forEachIndexed { index, uri ->
                a {
                    href("#$uri")
                    img {
                        src("/experiences$uri")
                    }
                }

                a("lightbox transition", uri) {
                    href("#_1")
                }
            }
        }
    }
}