package com.yangnk.spring.springDIDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-09-16 下午6:09
 **/
public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("Inside TextEditor constructor.");
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
