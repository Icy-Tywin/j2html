package j2html.tags.attributes;

import j2html.tags.IInstance;
import j2html.tags.Tag;

public interface IOnratechange<T extends Tag> extends IInstance<T> {
    default T withOnratechange(final String onratechange_) {
        get().attr("onratechange", onratechange_);
        return get();
    }

    default T withCondOnratechange(final boolean enable, final String onratechange_) {
        if (enable) {
            get().attr("onratechange", onratechange_);
        }
        return get();
    }
}
