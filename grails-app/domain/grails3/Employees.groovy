package grails3


import grails.rest.*

@Resource(uri="/employees", readOnly = false, formats = ['json', 'xml'])
class Employees {
	String name
	String company
}