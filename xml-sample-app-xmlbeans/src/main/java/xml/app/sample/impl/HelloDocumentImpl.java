/*
 * An XML document type.
 * Localname: hello
 * Namespace: http://xmlbeans.apache.org/samples/template/sampletemplate
 * Java type: xml.app.sample.HelloDocument
 *
 * Automatically generated - do not modify.
 */
package xml.app.sample.impl;
/**
 * A document containing one hello(@http://xmlbeans.apache.org/samples/template/sampletemplate) element.
 *
 * This is a complex type.
 */
public class HelloDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xml.app.sample.HelloDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelloDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELLO$0 = 
        new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "hello");
    
    
    /**
     * Gets the "hello" element
     */
    public xml.app.sample.HelloDocument.Hello getHello()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xml.app.sample.HelloDocument.Hello target = null;
            target = (xml.app.sample.HelloDocument.Hello)get_store().find_element_user(HELLO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hello" element
     */
    public void setHello(xml.app.sample.HelloDocument.Hello hello)
    {
        synchronized (monitor())
        {
            check_orphaned();
            xml.app.sample.HelloDocument.Hello target = null;
            target = (xml.app.sample.HelloDocument.Hello)get_store().find_element_user(HELLO$0, 0);
            if (target == null)
            {
                target = (xml.app.sample.HelloDocument.Hello)get_store().add_element_user(HELLO$0);
            }
            target.set(hello);
        }
    }
    
    /**
     * Appends and returns a new empty "hello" element
     */
    public xml.app.sample.HelloDocument.Hello addNewHello()
    {
        synchronized (monitor())
        {
            check_orphaned();
            xml.app.sample.HelloDocument.Hello target = null;
            target = (xml.app.sample.HelloDocument.Hello)get_store().add_element_user(HELLO$0);
            return target;
        }
    }
    /**
     * An XML hello(@http://xmlbeans.apache.org/samples/template/sampletemplate).
     *
     * This is a complex type.
     */
    public static class HelloImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements xml.app.sample.HelloDocument.Hello
    {
        private static final long serialVersionUID = 1L;
        
        public HelloImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://xmlbeans.apache.org/samples/template/sampletemplate", "name");
        
        
        /**
         * Gets array of all "name" elements
         */
        public java.lang.String[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "name" element
         */
        public java.lang.String getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "name" element
         */
        public org.apache.xmlbeans.XmlString xgetNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0);
            }
        }
        
        /**
         * Sets array of all "name" element
         */
        public void setNameArray(java.lang.String[] nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets ith "name" element
         */
        public void setNameArray(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) array of all "name" element
         */
        public void xsetNameArray(org.apache.xmlbeans.XmlString[]nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets (as xml) ith "name" element
         */
        public void xsetNameArray(int i, org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(name);
            }
        }
        
        /**
         * Inserts the value as the ith "name" element
         */
        public void insertName(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAME$0, i);
                target.setStringValue(name);
            }
        }
        
        /**
         * Appends the value as the last "name" element
         */
        public void addName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                target.setStringValue(name);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        public org.apache.xmlbeans.XmlString insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        public org.apache.xmlbeans.XmlString addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, i);
            }
        }
    }
}
