# Exercise 2: Implementing the Factory Method Pattern

## Objective

Implement the Factory Method Design Pattern to create different types of documents such as Word, PDF, and Excel.

## Components

### Document Interface

Defines the common operation `open()`.

### Concrete Documents

* WordDocument
* PdfDocument
* ExcelDocument

### Abstract Factory

* DocumentFactory

### Concrete Factories

* WordDocumentFactory
* PdfDocumentFactory
* ExcelDocumentFactory

### Test Class

FactoryMethodTest demonstrates the creation of different document types using factory classes.

## Output

Opening Word Document
Opening PDF Document
Opening Excel Document
