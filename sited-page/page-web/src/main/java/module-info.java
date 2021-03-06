/**
 * @author chi
 */
module sited.page.web {
    requires com.google.common;
    requires java.xml.bind;
    requires slf4j.api;
    requires java.validation;
    requires java.transaction;
    requires aopalliance.repackaged;
    requires javax.annotation.api;
    requires javax.inject;
    requires java.ws.rs;
    requires sited.module;
    requires sited.web;
    requires sited.template;
    requires sited.file.api;
    requires sited.page.api;
    requires sited.user.api;
    requires sited.cache;
    requires sited.message;

    requires org.commonmark;
    requires org.commonmark.ext.autolink;
    requires org.commonmark.ext.gfm.strikethrough;
    requires org.commonmark.ext.gfm.tables;
    requires org.commonmark.ext.heading.anchor;
    requires org.commonmark.ext.ins;

    exports io.sited.page.web;
}