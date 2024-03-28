package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222341387";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Simranjit_Singh";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2(){
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("minJanuary1ShouldIncrementToJanuary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	} 
		// Code here
	
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31(){
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("minJanuary1ShouldDecrementToDecember31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	} 
		// Code here
	
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	//Feb
	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("February29ShouldIncrementToMarch > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxFebruary29ShouldDecrementToFebruary28() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("February29ShouldDecrementToFebruary28 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testNominalFebruary() {
		int rand_day_1_to_29 = 1 + new Random().nextInt(29);
        DateUtil date = new DateUtil(rand_day_1_to_29, 2, 2024);
        System.out.println("testNominalFebruary > " + date);
        date.increment();
        System.out.println(date);
	}
	
	
	@Test
	public void testMinFebruary1ShouldIncrementToFebruary2(){
	    DateUtil date = new DateUtil(1, 2, 2024);
	    System.out.println("MinFebruary1ShouldIncrementToFebruary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	} 
	
	
	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31(){
	    DateUtil date = new DateUtil(1, 2, 2024);
	    System.out.println("testMinFebruary1ShouldDecrementToJanuary31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	//Mar
	
	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("MaxMarch31ShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("MaxMarch31ShouldDecrementToMarch30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testNominalMarch() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
	    System.out.println("TestNominalMarch > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinMarch1ShouldIncrementToMarch2() {
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("MinMarch1ShouldIncrementToMarch2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testMinMarch1ShouldDecrementToFebruary29() {
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("MinMarch1ShouldDecrementToFebruary28 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	//Apr
	
	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("MaxApril30ShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxApril30ShouldDecrementToApril29() {
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("MaxApril30ShouldDecrementToApril29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testNominalApril() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
	    System.out.println("TestNominalApril > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinApril1ShouldIncrementToApril2() {
	    DateUtil date = new DateUtil(1, 4, 2024);
	    System.out.println("MinApril1ShouldIncrementToApril2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testMinApril1ShouldDecrementToMarch31() {
	    DateUtil date = new DateUtil(1, 4, 2024);
	    System.out.println("MinApril1ShouldDecrementToMarch31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	//May
	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("MaxMay31ShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxMay31ShouldDecrementToMay30() {
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("MaxMay31ShouldDecrementToMay30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testNominalMay() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
	    System.out.println("TestNominalMay > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinMay1ShouldIncrementToMay2() {
	    DateUtil date = new DateUtil(1, 5, 2024);
	    System.out.println("MinMay1ShouldIncrementToMay2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testMinMay1ShouldDecrementToApril30() {
	    DateUtil date = new DateUtil(1, 5, 2024);
	    System.out.println("MinMay1ShouldDecrementToApril30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	//Jun
	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("MaxJune30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("MaxJune30ShouldDecrementToJune29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testNominalJune() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
	    System.out.println("TestNominalJune > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinJune1ShouldIncrementToJune2() {
	    DateUtil date = new DateUtil(1, 6, 2024);
	    System.out.println("MinJune1ShouldIncrementToJune2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testMinJune1ShouldDecrementToMay31() {
	    DateUtil date = new DateUtil(1, 6, 2024);
	    System.out.println("MinJune1ShouldDecrementToMay31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	//Jul
	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("MaxJuly31ShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJuly31ShouldDecrementToJuly30() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("MaxJuly31ShouldDecrementToJuly30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testNominalJuly() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
	    System.out.println("TestNominalJuly > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinJuly1ShouldIncrementToJuly2() {
	    DateUtil date = new DateUtil(1, 7, 2024);
	    System.out.println("MinJuly1ShouldIncrementToJuly2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testMinJuly1ShouldDecrementToJune30() {
	    DateUtil date = new DateUtil(1, 7, 2024);
	    System.out.println("MinJuly1ShouldDecrementToJune30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	//Aug
	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("MaxAugust31ShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxAugust31ShouldDecrementToAugust30() {
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("MaxAugust31ShouldDecrementToAugust30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testNominalAugust() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
	    System.out.println("TestNominalAugust > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinAugust1ShouldIncrementToAugust2() {
	    DateUtil date = new DateUtil(1, 8, 2024);
	    System.out.println("MinAugust1ShouldIncrementToAugust2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testMinAugust1ShouldDecrementToJuly31() {
	    DateUtil date = new DateUtil(1, 8, 2024);
	    System.out.println("MinAugust1ShouldDecrementToJuly31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}

	//Sep
	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("MaxSeptember30ShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxSeptember30ShouldDecrementToSeptember29() {
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("MaxSeptember30ShouldDecrementToSeptember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testNominalSeptember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
	    System.out.println("TestNominalSeptember > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinSeptember1ShouldIncrementToSeptember2() {
	    DateUtil date = new DateUtil(1, 9, 2024);
	    System.out.println("MinSeptember1ShouldIncrementToSeptember2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testMinSeptember1ShouldDecrementToAugust31() {
	    DateUtil date = new DateUtil(1, 9, 2024);
	    System.out.println("MinSeptember1ShouldDecrementToAugust31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	//Oct
	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("MaxOctober31ShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxOctober31ShouldDecrementToOctober30() {
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("MaxOctober31ShouldDecrementToOctober30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testNominalOctober() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
	    System.out.println("TestNominalOctober > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinOctober1ShouldIncrementToOctober2() {
	    DateUtil date = new DateUtil(1, 10, 2024);
	    System.out.println("MinOctober1ShouldIncrementToOctober2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testMinOctober1ShouldDecrementToSeptember30() {
	    DateUtil date = new DateUtil(1, 10, 2024);
	    System.out.println("MinOctober1ShouldDecrementToSeptember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	//Nov
	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("MaxNovember30ShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxNovember30ShouldDecrementToNovember29() {
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("MaxNovember30ShouldDecrementToNovember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testNominalNovember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
	    System.out.println("TestNominalNovember > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinNovember1ShouldIncrementToNovember2() {
	    DateUtil date = new DateUtil(1, 11, 2024);
	    System.out.println("MinNovember1ShouldIncrementToNovember2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testMinNovember1ShouldDecrementToOctober31() {
	    DateUtil date = new DateUtil(1, 11, 2024);
	    System.out.println("MinNovember1ShouldDecrementToOctober31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	}

	//Dec
	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1() {
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("MaxDecember31ShouldIncrementToJanuary1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("MaxDecember31ShouldDecrementToDecember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testNominalDecember() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
	    System.out.println("TestNominalDecember > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinDecember1ShouldIncrementToDecember2() {
	    DateUtil date = new DateUtil(1, 12, 2024);
	    System.out.println("MinDecember1ShouldIncrementToDecember2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMinDecember1ShouldDecrementToNovember30() {
	    DateUtil date = new DateUtil(1, 12, 2024);
	    System.out.println("MinDecember1ShouldDecrementToNovember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}
	
	// Additional Test cases for February  with a leap year condition
	
	@Test
	public void testLeapYearMaxFebruary29ShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2016);
	    System.out.println("LeapYearMaxFebruary29ShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testLeapYearMaxFebruary29ShouldDecrementToFebruary28() {
	    DateUtil date = new DateUtil(29, 2, 2016);
	    System.out.println("LeapYearMaxFebruary29ShouldDecrementToFebruary28 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(28, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testLeapYearMinFebruary1ShouldIncrementToFebruary2() {
	    DateUtil date = new DateUtil(1, 2, 2016);
	    System.out.println("LeapYearMinFebruary1ShouldIncrementToFebruary2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testLeapYearMinFebruary1ShouldDecrementToJanuary31() {
	    DateUtil date = new DateUtil(1, 2, 2016);
	    System.out.println("LeapYearMinFebruary1ShouldDecrementToJanuary31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}

	@Test
	public void testLeapYearNominalFebruary() {
	    int rand_day_1_to_29 = 1 + new Random().nextInt(29);
	    DateUtil date = new DateUtil(rand_day_1_to_29, 2, 2016);
	    System.out.println("LeapYearNominalFebruary > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testLeapYearNominalFebruaryEndOfMonth() {
	    DateUtil date = new DateUtil(29, 2, 2016);
	    System.out.println("LeapYearNominalFebruaryEndOfMonth > " + date);
	    date.increment();
	    System.out.println(date);
	}

	
	
}
