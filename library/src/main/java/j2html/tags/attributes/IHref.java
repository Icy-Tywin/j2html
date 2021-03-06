package j2html.tags.attributes;

import j2html.tags.IInstance;
import j2html.tags.Tag;

public interface IHref<T extends Tag> extends IInstance<T> {
    default T withHref(final String href_) {
        get().attr("href", href_);
        return get();
    }

    default T withCondHref(final boolean enable, final String href_) {
        if (enable) {
            get().attr("href", href_);
        }
        return get();
    }
}
