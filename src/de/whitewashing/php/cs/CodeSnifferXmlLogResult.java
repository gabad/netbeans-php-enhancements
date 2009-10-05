/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package de.whitewashing.php.cs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author benny
 */
class CodeSnifferXmlLogResult {

    static public CodeSnifferXmlLogResult empty()
    {
        return new CodeSnifferXmlLogResult(new ArrayList<CodingStandardError>(), new ArrayList <CodingStandardWarning>());
    }

    private List<CodingStandardError> csErrors = null;
    private List<CodingStandardWarning> csWarnings = null;

    public CodeSnifferXmlLogResult(List<CodingStandardError> csErrors, List<CodingStandardWarning> csWarnings)
    {
        this.csErrors = csErrors;
        this.csWarnings = csWarnings;
    }

    public List<CodingStandardError> getCsErrors() {
        return csErrors;
    }

    public List<CodingStandardWarning> getCsWarnings() {
        return csWarnings;
    }
}
