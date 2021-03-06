package org.aksw.beast.vocabs;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

/**
 * Iteration vocabulary
 *
 * Defines generic terms for looping
 *
 * Users should only fall back to these terms if they know of no better vocabulary that fits their use.
 *
 * Suggested order (based on gut feeling)
 * experiment > job > step > run > phase > cycle
 *
 * @author raven
 *
 */
public class IV {
    public static final String ns = "http://iv.aksw.org/vocab#";

    public static Resource resource(String local) { return ResourceFactory.createResource(ns + local); }
    public static Property property(String local) { return ResourceFactory.createProperty(ns + local); }

    public static final Property warmup = property("warmup");
    public static final Property skip = property("skip");

    public static final Property experiment = property("experiment");
    public static final Property method = property("method");
    public static final Property value = property("value");
    public static final Property assessment = property("assessment");


    public static final Property thread = property("thread");
    public static final Property job = property("job");
    public static final Property step = property("step");
    public static final Property run = property("run");
    public static final Property phase = property("phase");
    public static final Property cycle = property("cycle");



    // Overall id of an item in a stream
    public static final Property item = property("item");

}
