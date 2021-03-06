/*
 * Copyright (c) 2017, University of Oslo
 *
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * Neither the name of the HISP project nor the names of its contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.hisp.dhis.android.core.program;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.gabrielittner.auto.value.cursor.ColumnName;
import com.google.auto.value.AutoValue;

import org.hisp.dhis.android.core.common.BaseNameableObjectModel;

@AutoValue
public abstract class ProgramIndicatorModel extends BaseNameableObjectModel {
    public static final String TABLE = "ProgramIndicator";

    public static class Columns extends BaseNameableObjectModel.Columns {
        public static final String DISPLAY_IN_FORM = "displayInForm";
        public static final String EXPRESSION = "expression";
        public static final String DIMENSION_ITEM = "dimensionItem";
        public static final String FILTER = "filter";
        public static final String DECIMALS = "decimals";
        public static final String PROGRAM = "program";
    }

    @NonNull
    public static ProgramIndicatorModel.Builder builder() {
        return new $$AutoValue_ProgramIndicatorModel.Builder();
    }

    @NonNull
    public static ProgramIndicatorModel create(Cursor cursor) {
        return AutoValue_ProgramIndicatorModel.createFromCursor(cursor);
    }

    @Nullable
    @ColumnName(Columns.DISPLAY_IN_FORM)
    public abstract Boolean displayInForm();

    @Nullable
    @ColumnName(Columns.EXPRESSION)
    public abstract String expression();

    @Nullable
    @ColumnName(Columns.DIMENSION_ITEM)
    public abstract String dimensionItem();

    @Nullable
    @ColumnName(Columns.FILTER)
    public abstract String filter();

    @Nullable
    @ColumnName(Columns.DECIMALS)
    public abstract Integer decimals();

    @Nullable
    @ColumnName(Columns.PROGRAM)
    public abstract String program();

    @NonNull
    public abstract ContentValues toContentValues();

    @AutoValue.Builder
    public static abstract class Builder extends BaseNameableObjectModel.Builder<Builder> {

        @ColumnName(Columns.DISPLAY_IN_FORM)
        public abstract Builder displayInForm(@Nullable Boolean displayInForm);

        @ColumnName(Columns.EXPRESSION)
        public abstract Builder expression(@Nullable String expression);

        @ColumnName(Columns.DIMENSION_ITEM)
        public abstract Builder dimensionItem(@Nullable String dimensionItem);

        @ColumnName(Columns.FILTER)
        public abstract Builder filter(@Nullable String filter);

        @ColumnName(Columns.DECIMALS)
        public abstract Builder decimals(@Nullable Integer decimals);

        @ColumnName(Columns.PROGRAM)
        public abstract Builder program(@Nullable String program);

        abstract ProgramIndicatorModel build();
    }
}