package decorator.test

import decorator.decorators.DivDecorator
import decorator.decorators.HtmlSubject
import decorator.decorators.IHtmlDecorate
import decorator.decorators.StyleDecorator

fun main() {
    var decorators: IHtmlDecorate = DivDecorator(
        HtmlSubject("Hello, World!"), "highlight"
    )
    decorators = StyleDecorator(decorators, "border: 2px solid black")

    val html = decorators.decorateAndReturn()
}