package edu.stanford.bmir.protege.web.client.match;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Provider;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 13 Jun 2018
 */
public class StringContainsRepeatedSpacesCriteriaPresenterFactory implements CriteriaPresenterFactory {

    @Nonnull
    private final Provider<StringContainsRepeatedSpacesCriteriaPresenter> presenterProvider;

    @Inject
    public StringContainsRepeatedSpacesCriteriaPresenterFactory(@Nonnull Provider<StringContainsRepeatedSpacesCriteriaPresenter> presenterProvider) {
        this.presenterProvider = checkNotNull(presenterProvider);
    }

    @Nonnull
    @Override
    public String getDisplayName() {
        return "contains repeated spaces";
    }

    @Nonnull
    @Override
    public CriteriaPresenter createPresenter() {
        return presenterProvider.get();
    }
}
