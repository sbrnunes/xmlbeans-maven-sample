/*
 * An XML document type.
 * Localname: hello
 * Namespace: http://xmlbeans.apache.org/samples/template/sampletemplate
 * Java type: xml.app.sample.HelloDocument
 *
 * Automatically generated - do not modify.
 */
package xml.app.sample;


/**
 * A document containing one hello(@http://xmlbeans.apache.org/samples/template/sampletemplate) element.
 *
 * This is a complex type.
 */
public interface HelloDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HelloDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s65B548F70AE3E46222FDC827F9951FE5").resolveHandle("helloc5ffdoctype");
    
    /**
     * Gets the "hello" element
     */
    xml.app.sample.HelloDocument.Hello getHello();
    
    /**
     * Sets the "hello" element
     */
    void setHello(xml.app.sample.HelloDocument.Hello hello);
    
    /**
     * Appends and returns a new empty "hello" element
     */
    xml.app.sample.HelloDocument.Hello addNewHello();
    
    /**
     * An XML hello(@http://xmlbeans.apache.org/samples/template/sampletemplate).
     *
     * This is a complex type.
     */
    public interface Hello extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hello.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s65B548F70AE3E46222FDC827F9951FE5").resolveHandle("hellod601elemtype");
        
        /**
         * Gets array of all "name" elements
         */
        java.lang.String[] getNameArray();
        
        /**
         * Gets ith "name" element
         */
        java.lang.String getNameArray(int i);
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        org.apache.xmlbeans.XmlString[] xgetNameArray();
        
        /**
         * Gets (as xml) ith "name" element
         */
        org.apache.xmlbeans.XmlString xgetNameArray(int i);
        
        /**
         * Returns number of "name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "name" element
         */
        void setNameArray(java.lang.String[] nameArray);
        
        /**
         * Sets ith "name" element
         */
        void setNameArray(int i, java.lang.String name);
        
        /**
         * Sets (as xml) array of all "name" element
         */
        void xsetNameArray(org.apache.xmlbeans.XmlString[] nameArray);
        
        /**
         * Sets (as xml) ith "name" element
         */
        void xsetNameArray(int i, org.apache.xmlbeans.XmlString name);
        
        /**
         * Inserts the value as the ith "name" element
         */
        void insertName(int i, java.lang.String name);
        
        /**
         * Appends the value as the last "name" element
         */
        void addName(java.lang.String name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        org.apache.xmlbeans.XmlString insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        org.apache.xmlbeans.XmlString addNewName();
        
        /**
         * Removes the ith "name" element
         */
        void removeName(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static xml.app.sample.HelloDocument.Hello newInstance() {
              return (xml.app.sample.HelloDocument.Hello) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static xml.app.sample.HelloDocument.Hello newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (xml.app.sample.HelloDocument.Hello) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static xml.app.sample.HelloDocument newInstance() {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static xml.app.sample.HelloDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static xml.app.sample.HelloDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static xml.app.sample.HelloDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static xml.app.sample.HelloDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static xml.app.sample.HelloDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static xml.app.sample.HelloDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static xml.app.sample.HelloDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static xml.app.sample.HelloDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static xml.app.sample.HelloDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static xml.app.sample.HelloDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static xml.app.sample.HelloDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static xml.app.sample.HelloDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static xml.app.sample.HelloDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static xml.app.sample.HelloDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static xml.app.sample.HelloDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xml.app.sample.HelloDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static xml.app.sample.HelloDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (xml.app.sample.HelloDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
