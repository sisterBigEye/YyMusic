package com.example.administrator.yymusic.api;

/**
 * Created by archermind on 17-8-9.
 *
 * @author yysleep
 */

public interface IFileOperationCallback {

    void refreshDeleteFile(Boolean result);

    void syncList(String path);

}
