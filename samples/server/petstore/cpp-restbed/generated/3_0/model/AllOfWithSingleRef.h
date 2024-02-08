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

/*
 * AllOfWithSingleRef.h
 *
 * 
 */

#ifndef AllOfWithSingleRef_H_
#define AllOfWithSingleRef_H_



#include <string>
#include "SingleRefType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  AllOfWithSingleRef 
{
public:
    AllOfWithSingleRef() = default;
    explicit AllOfWithSingleRef(boost::property_tree::ptree const& pt);
    virtual ~AllOfWithSingleRef() = default;

    AllOfWithSingleRef(const AllOfWithSingleRef& other) = default; // copy constructor
    AllOfWithSingleRef(AllOfWithSingleRef&& other) noexcept = default; // move constructor

    AllOfWithSingleRef& operator=(const AllOfWithSingleRef& other) = default; // copy assignment
    AllOfWithSingleRef& operator=(AllOfWithSingleRef&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// AllOfWithSingleRef members

    /// <summary>
    /// 
    /// </summary>
    std::string getUsername() const;
    void setUsername(std::string value);

    /// <summary>
    /// 
    /// </summary>
    SingleRefType getSingleRefType() const;
    void setSingleRefType(SingleRefType value);

protected:
    std::string m_Username = "";
    SingleRefType m_SingleRefType = SingleRefType{};
};

std::vector<AllOfWithSingleRef> createAllOfWithSingleRefVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<AllOfWithSingleRef>(const AllOfWithSingleRef& val) {
    return val.toPropertyTree();
}

template<>
inline AllOfWithSingleRef fromPt<AllOfWithSingleRef>(const boost::property_tree::ptree& pt) {
    AllOfWithSingleRef ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* AllOfWithSingleRef_H_ */
