/**
 * <pre>
 * +-------------+   +------------------------+   +----------+   +--------+
 * |             |   |                        |   |          |   |        |
 * | Parse input +---> Create signatures grid +---> Colorize +---> Output |
 * |             |   |                        |   |          |   |        |
 * +-------------+   +------------------------+   +----------+   +--------+
 *
 * arg[0] = size             +--------------------+   Color[x][y]
 * arg[1] = Regex pattern    |                    |
 *                           | Pattern = '1.+2.*' |   +------+------+
 * +-+-+    +--+--+--+--+    | Signatures:        |   |[0][0]|[1][0]|
 * |2|1|    |22|21|12|11|    | 1224 -> WHITE      |   +-------------+
 * +---+    +-----------+    |                    |   |[0][1]|[1][1]|
 * |3|4|    |23|24|13|14|    | 2224 -> BLACK      |   +------+------+
 * +-+-+    +-----------+    |                    |
 *          |32|31|42|41|    | 1332 -> WHITE      |
 *          +-----------+    |                    |
 *          |33|34|43|44|    +--------------------+
 *          +--+--+--+--+
 * </pre>
 */
package pv260.refactoring.regexfractals;
