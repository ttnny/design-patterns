package decorator.decorators

class StyleDecorator(val other: IHtmlDecorate, val styles: String) : IHtmlDecorate {
    override fun decorateAndReturn(): String {
        val result = other.decorateAndReturn()

        return "<div class=\"$styles\">$result</div>"
    }
}