package ua.nure.danylenko.practice7;

import ua.nure.danylenko.practice7.controller.DOMController;
import ua.nure.danylenko.practice7.entity.Devices;

public class Main {
    public static void usage() {
        System.out.println("java ua.nure.danylenko.practice7.Main xmlFileName");
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            usage();
            return;
        }

        String xmlFileName = args[0];
        System.out.println("Input ==> " + xmlFileName);

        ////////////////////////////////////////////////////////
        // DOM
        ////////////////////////////////////////////////////////

        // get
        DOMController domController = new DOMController(xmlFileName);
        domController.parse(true);
        Devices devices = domController.getDevices();

        // sort (case 1)
        Sorter.sortDevicesByNames(devices);

        // save
        String outputXmlFile = "output.dom.xml";
        DOMController.saveToXML(devices, outputXmlFile);
        System.out.println("Output ==> " + outputXmlFile);

        ////////////////////////////////////////////////////////
        // SAX
        ////////////////////////////////////////////////////////

        // get
//        SAXController saxController = new SAXController(xmlFileName);
//        saxController.parse(true);
//        devices = saxController.getDevices();
//
//        // sort  (case 2)
//        Sorter.sortDevicesByPrice(devices);
//
//        // save
//        outputXmlFile = "output.sax.xml";
//
//        // other way:
//        DOMController.saveToXML(devices, outputXmlFile);
//        System.out.println("Output ==> " + outputXmlFile);
//
//        ////////////////////////////////////////////////////////
//        // StAX
//        ////////////////////////////////////////////////////////
//
//        // get
//        STAXController staxController = new STAXController(xmlFileName);
//        staxController.parse();
//        devices = staxController.getDevices();
//
//        // sort  (case 3)
//        Sorter.sortAnswersByContent(devices);
//
//        // save
//        outputXmlFile = "output.stax.xml";
//        DOMController.saveToXML(devices, outputXmlFile);
//        System.out.println("Output ==> " + outputXmlFile);
    }
}
