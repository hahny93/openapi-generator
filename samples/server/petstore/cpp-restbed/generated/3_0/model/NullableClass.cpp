/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.3.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "NullableClass.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

NullableClass::NullableClass(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string NullableClass::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void NullableClass::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree NullableClass::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("integer_prop", m_Integer_prop);
	pt.put("number_prop", m_Number_prop);
	pt.put("boolean_prop", m_Boolean_prop);
	pt.put("string_prop", m_String_prop);
	pt.put("date_prop", m_Date_prop);
	pt.put("datetime_prop", m_Datetime_prop);
	// generate tree for Array_nullable_prop
    tmp_node.clear();
	if (!m_Array_nullable_prop.empty()) {
        tmp_node = toPt(m_Array_nullable_prop);
		pt.add_child("array_nullable_prop", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Array_and_items_nullable_prop
    tmp_node.clear();
	if (!m_Array_and_items_nullable_prop.empty()) {
        tmp_node = toPt(m_Array_and_items_nullable_prop);
		pt.add_child("array_and_items_nullable_prop", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Array_items_nullable
    tmp_node.clear();
	if (!m_Array_items_nullable.empty()) {
        tmp_node = toPt(m_Array_items_nullable);
		pt.add_child("array_items_nullable", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Object_nullable_prop
    if (!m_Object_nullable_prop.empty()) {
        tmp_node = toPt(m_Object_nullable_prop);
        pt.add_child("object_nullable_prop", tmp_node);
    }
    tmp_node.clear();
	// generate tree for Object_and_items_nullable_prop
    if (!m_Object_and_items_nullable_prop.empty()) {
        tmp_node = toPt(m_Object_and_items_nullable_prop);
        pt.add_child("object_and_items_nullable_prop", tmp_node);
    }
    tmp_node.clear();
	// generate tree for Object_items_nullable
    if (!m_Object_items_nullable.empty()) {
        tmp_node = toPt(m_Object_items_nullable);
        pt.add_child("object_items_nullable", tmp_node);
    }
    tmp_node.clear();
	return pt;
}

void NullableClass::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Integer_prop = pt.get("integer_prop", 0);
	m_Number_prop = pt.get("number_prop", 0.0);
	m_Boolean_prop = pt.get("boolean_prop", false);
	m_String_prop = pt.get("string_prop", "");
	m_Date_prop = pt.get("date_prop", "");
	m_Datetime_prop = pt.get("datetime_prop", "");
	// push all items of Array_nullable_prop into member
	if (pt.get_child_optional("array_nullable_prop")) {
        m_Array_nullable_prop = fromPt<std::vector<std::string>>(pt.get_child("array_nullable_prop"));
	}
	// push all items of Array_and_items_nullable_prop into member
	if (pt.get_child_optional("array_and_items_nullable_prop")) {
        m_Array_and_items_nullable_prop = fromPt<std::vector<std::string>>(pt.get_child("array_and_items_nullable_prop"));
	}
	// push all items of Array_items_nullable into member
	if (pt.get_child_optional("array_items_nullable")) {
        m_Array_items_nullable = fromPt<std::vector<std::string>>(pt.get_child("array_items_nullable"));
	}
    if (pt.get_child_optional("object_nullable_prop")) {
        m_Object_nullable_prop = fromPt<std::map<std::string, std::string>>(pt.get_child("object_nullable_prop"));
    }
    if (pt.get_child_optional("object_and_items_nullable_prop")) {
        m_Object_and_items_nullable_prop = fromPt<std::map<std::string, std::string>>(pt.get_child("object_and_items_nullable_prop"));
    }
    if (pt.get_child_optional("object_items_nullable")) {
        m_Object_items_nullable = fromPt<std::map<std::string, std::string>>(pt.get_child("object_items_nullable"));
    }
}

int32_t NullableClass::getIntegerProp() const
{
    return m_Integer_prop;
}

void NullableClass::setIntegerProp(int32_t value)
{
    m_Integer_prop = value;
}


double NullableClass::getNumberProp() const
{
    return m_Number_prop;
}

void NullableClass::setNumberProp(double value)
{
    m_Number_prop = value;
}


bool NullableClass::isBooleanProp() const
{
    return m_Boolean_prop;
}

void NullableClass::setBooleanProp(bool value)
{
    m_Boolean_prop = value;
}


std::string NullableClass::getStringProp() const
{
    return m_String_prop;
}

void NullableClass::setStringProp(std::string value)
{
    m_String_prop = value;
}


std::string NullableClass::getDateProp() const
{
    return m_Date_prop;
}

void NullableClass::setDateProp(std::string value)
{
    m_Date_prop = value;
}


std::string NullableClass::getDatetimeProp() const
{
    return m_Datetime_prop;
}

void NullableClass::setDatetimeProp(std::string value)
{
    m_Datetime_prop = value;
}


std::vector<std::string> NullableClass::getArrayNullableProp() const
{
    return m_Array_nullable_prop;
}

void NullableClass::setArrayNullableProp(std::vector<std::string> value)
{
    m_Array_nullable_prop = value;
}


std::vector<std::string> NullableClass::getArrayAndItemsNullableProp() const
{
    return m_Array_and_items_nullable_prop;
}

void NullableClass::setArrayAndItemsNullableProp(std::vector<std::string> value)
{
    m_Array_and_items_nullable_prop = value;
}


std::vector<std::string> NullableClass::getArrayItemsNullable() const
{
    return m_Array_items_nullable;
}

void NullableClass::setArrayItemsNullable(std::vector<std::string> value)
{
    m_Array_items_nullable = value;
}


std::map<std::string, std::string> NullableClass::getObjectNullableProp() const
{
    return m_Object_nullable_prop;
}

void NullableClass::setObjectNullableProp(std::map<std::string, std::string> value)
{
    m_Object_nullable_prop = value;
}


std::map<std::string, std::string> NullableClass::getObjectAndItemsNullableProp() const
{
    return m_Object_and_items_nullable_prop;
}

void NullableClass::setObjectAndItemsNullableProp(std::map<std::string, std::string> value)
{
    m_Object_and_items_nullable_prop = value;
}


std::map<std::string, std::string> NullableClass::getObjectItemsNullable() const
{
    return m_Object_items_nullable;
}

void NullableClass::setObjectItemsNullable(std::map<std::string, std::string> value)
{
    m_Object_items_nullable = value;
}



std::vector<NullableClass> createNullableClassVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<NullableClass>();
    for (const auto& child: pt) {
        vec.emplace_back(NullableClass(child.second));
    }

    return vec;
}

}
}
}
}

