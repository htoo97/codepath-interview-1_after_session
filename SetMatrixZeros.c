/* Set Matrix Zeros */
/*
 * Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.
 */

/**
 *  * @input A : 2D integer array 
 *   * @input n11 : Integer array's ( A ) rows
 *    * @input n12 : Integer array's ( A ) columns
 *     * 
 *      * @Output Void. Just modifies the args passed by reference 
 *       */
void setZeroes(int** A, int n11, int n12) {
    char rows[n11];
    memset(rows, 0, n11);

    char cols[n12];
    memset(cols, 0, n12);

    int r;
    int c;

    for (r = 0; r < n11; r++) {
        for (c = 0; c < n12; c++) {
            if (A[r][c] == 0) {
                rows[r] = 'f';
                cols[c] = 'f';
            }
        }
    }

    for (r = 0; r < n11; r++) {
        if (rows[r] != 0) {
            // set whole row to 0
            for (c=0; c<n12; c++) {
                A[r][c] = 0;
            }
        }
    }

    for (c=0; c<n12; c++) {                                                                                               if (cols[c] != 0) {
        // set whole col to 0
        for (r=0; r<n11; r++) {
            A[r][c] = 0;
        }
      }
    }
}

