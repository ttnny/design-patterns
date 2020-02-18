package decorator.decorators

class HtmlSubject(val subject: String) : IHtmlDecorate {
    override fun decorateAndReturn(): String {
        return subject
    }
}