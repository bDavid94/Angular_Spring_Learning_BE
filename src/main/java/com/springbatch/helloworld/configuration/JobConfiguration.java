//package com.springbatch.helloworld.configuration;
//
//import com.springbatch.helloworld.domain.Customer;
//import com.springbatch.helloworld.repository.CustomerRepository;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.launch.support.RunIdIncrementer;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.batch.item.file.MultiResourceItemReader;
//import org.springframework.batch.item.file.mapping.DefaultLineMapper;
//import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//
//import javax.sql.DataSource;
//
//@org.springframework.context.annotation.Configuration
//@EnableBatchProcessing
//public class JobConfiguration {
//
//    @Autowired
//    private JobBuilderFactory jobBuilderFactory;
//
//    @Autowired
//    private StepBuilderFactory stepBuilderFactory;
//
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Value("classpath*:/customer*.csv")
//    private Resource[] inputFiles;
////
////    @Bean
////    public JdbcCursorItemReader<Customer> customItemReader() {
////       JdbcCursorItemReader<Customer> reader = new JdbcCursorItemReader<>();
////
////       reader.setSql("select * from customer order by LAST_NAME, FIRST_NAME");
////       reader.setDataSource(dataSource);
////       reader.setRowMapper(new CustomerRowMapper());
////
////       return reader;
////    }
//
//
////    @Bean
////    public JdbcPagingItemReader<Customer> customItemReader() {
////        JdbcPagingItemReader<Customer> reader = new JdbcPagingItemReader<>();
////
////        reader.setDataSource(dataSource);
////        reader.setFetchSize(2);
////        reader.setRowMapper(new CustomerRowMapper());
////
////        H2PagingQueryProvider queryProvider = new H2PagingQueryProvider();
////        queryProvider.setSelectClause("*");
////        queryProvider.setFromClause("from customer");
////
////        Map<String, Order> sortKeys = new HashMap<>(1);
////        sortKeys.put("id", Order.ASCENDING);
////        queryProvider.setSortKeys(sortKeys);
////        reader.setQueryProvider(queryProvider);
////        return reader;
////    }
//
////    @Bean
////    public FlatFileItemReader<Customer> customItemReader() {
////        FlatFileItemReader<Customer> reader = new FlatFileItemReader<>();
////
////        reader.setLinesToSkip(1);
////        reader.setResource(new ClassPathResource("/customer2.csv"));
////        DefaultLineMapper<Customer> mapper = new DefaultLineMapper<>();
////
////        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
////        tokenizer.setNames("firstName", "lastName", "birthDate");
////        mapper.setLineTokenizer(tokenizer);
////        mapper.setFieldSetMapper(new CustomerFieldSetMapper());
////        mapper.afterPropertiesSet();
////
////        reader.setLineMapper(mapper);
////        return reader;
////    }
//
//    @Bean
//    public MultiResourceItemReader<Customer> multiResourceItemReader() {
//        MultiResourceItemReader<Customer> reader = new MultiResourceItemReader<>();
//
//        reader.setDelegate(customItemReader());
//        reader.setResources(inputFiles);
//        return reader;
//    }
//
//    @Bean
//    public FlatFileItemReader<Customer> customItemReader() {
//        FlatFileItemReader<Customer> reader = new FlatFileItemReader<>();
//
//        reader.setLinesToSkip(1);
//        reader.setResource(new ClassPathResource("/customer2.csv"));
//        DefaultLineMapper<Customer> mapper = new DefaultLineMapper<>();
//
//        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
//        tokenizer.setNames("firstName", "lastName", "birthDate");
//        mapper.setLineTokenizer(tokenizer);
////        mapper.setFieldSetMapper(new CustomerFieldSetMapper());
//        mapper.afterPropertiesSet();
//
//        reader.setLineMapper(mapper);
//        return reader;
//    }
//
//    @Bean
//    public ItemWriter<Customer> customerItemWriter() {
//
//        return customerRepository::saveAll;
//    }
//
//    @Bean
//    public Step step1() {
//        return stepBuilderFactory.get("step1")
//                .<Customer, Customer>chunk(2)
//                .reader(multiResourceItemReader())
//                .writer(customerItemWriter()).build();
//    }
//
//    @Bean
//    public Job basicJob() {
//        return jobBuilderFactory.get("basicJob")
//                .incrementer(new RunIdIncrementer())
//                .start(step1())
//                .build();
//    }
//
//
//}
