## CIREX - NLP document processor for race and ethnicity

CIREX (Clinical Information Race Ethnicity eXtractor) Pipeline is designed to find patient demographic data, specifically race and ethnicity in clinical text.

CIREX is based on Leo architecture extending UIMA AS.  For more info on Leo see [ http://department-of-veterans-affairs.github.io/Leo/userguide.html ]

To use CIREX :

  1.  Follow the instructions to install and configure UIMA AS Steps 2.1-2.9 on page [ http://department-of-veterans-affairs.github.io/Leo/userguide.html#/a2_Installation_and_Configuration_of_Leo-Example ] .  
  
  2. Start UIMA AS Broker.
     
  3. Configure CIREX reader and listeners.
    
    3.1 Three readers are available:
     
       3.1.1 FileCollectionReaderConfig.groovy  -- Enter the path to input directory to read simple text files. The files need to have .txt extention. 
      
       3.1.2 BatchDatabaseCollectionReader.groovy -- Enter the database engine, database name, and input query. Update the batch parameters. If you have only one batch, change the ending index to be less than the batch size. If you are using this reader for batch reads, add sequential numbering column called "RowNo" to your input table. The tags {min} and {max} will be automatically replaced with starting and ending RowNo for each batch until edning RowNo reaches the last endingIndex.
       
       3.1.3 SQLServerPagedDatabaseCollectionReaderConfig.groovy - Enter the database engine, database name, and input query. Make sure the input query ends with "order by" clause. The query will be automatically transformed for SQL Server fetching new batch with offset row number. This approach becomes very slow when the number of records reaches over 2.5M records. MS SQL Server queries become very slow at that point.
      
    3.2 Four listeners
    
       3.2.1 SimpleCsvListenerConfig.groovy - Enter the path to the output directory. A new file will be created with a standard output.
      
       3.2.2 SimpleXmiListenerConfig.groocy - Enter the path to the output directory. A new directory with xmi files will be created.
      
       3.2.3 CsvListenerConfig.groovy - this is an example of a custom CSV listener
      
       3.2.4 DatabaseListenerConfig.groovy - this is an example of a custom database listener. This will output all race and ethnicity instances from documents. For classifying documents to AA race and hispanic ethnicity, uncomment ClassifyDocument delegate in ExtractorPipeline.java, recompile the package and use DatabaseListenerConfigClassify.groovy instead
      
      
  4. Use runService.sh or runService.bat script to start the service.
  
  5. Modify runClient.sh or runClient.bat script with  the selected readers and listeners and start the client.
  
  
      
  
