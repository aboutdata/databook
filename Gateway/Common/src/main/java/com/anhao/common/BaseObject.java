package com.anhao.common;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author youyou
 */
public abstract class BaseObject implements Serializable {

    private static final long serialVersionUID = 20131015L;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, false);
    }
}
