/*
 * (C) Copyright 2020 Nuxeo (http://nuxeo.com/).
 * This is unpublished proprietary source code of Nuxeo SA. All rights reserved.
 * Notice of copyright on this source code does not indicate publication.
 *
 * Contributors:
 *     dmetzler
 */
package org.dmetzler;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CodingTest {

    private static final List<String> STRINGS = Arrays.asList("UN", "DEUX", "TROIS", "QUATRE");

    @Test
    public void can_concatenate_string() throws Exception {
        assertThat(StringLibrary.concatenate(STRINGS)).isEqualTo("UN, DEUX, TROIS, QUATRE");
    }

    @Test
    public void can_reverse_list() throws Exception {
        assertThat(StringLibrary.reverse(STRINGS)).isEqualTo(Arrays.asList("QUATRE", "TROIS", "DEUX", "UN"));
    }

    @Test
    public void can_update_list_to_lower() throws Exception {
        assertThat(StringLibrary.to_lower(STRINGS)).isEqualTo(Arrays.asList("un", "deux", "trois", "quatre"));
    }

    @Test
    public void all_in_one() throws Exception {
        List<String> strings = Arrays.asList("UN", "DEUX", "TROIS");
        assertThat(StringLibrary.concatenate(StringLibrary.reverse(StringLibrary.to_lower(strings)))).isEqualTo(
                "trois, deux, un");
    }

}
