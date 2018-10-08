package algorithm.implementation;

/**
 * kawnayeen
 * 2/10/18
 */
public class _45_TaumAndBirthday {
    long taumBday(long b, long w, long bc, long wc, long z) {
        if (bc > wc) {
            if (wc + z < bc)
                bc = wc + z;
        } else {
            if (bc + z < wc)
                wc = bc + z;
        }
        return b * bc + w * wc;
    }
}
