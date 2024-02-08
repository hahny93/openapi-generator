=begin
#Echo Server API

#Echo Server API

The version of the OpenAPI document: 0.1.0
Contact: team@openapitools.org
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.3.0

=end

# Common files
require 'openapi_client/api_client'
require 'openapi_client/api_error'
require 'openapi_client/version'
require 'openapi_client/configuration'

# Models
require 'openapi_client/models/bird'
require 'openapi_client/models/category'
require 'openapi_client/models/default_value'
require 'openapi_client/models/number_properties_only'
require 'openapi_client/models/pet'
require 'openapi_client/models/query'
require 'openapi_client/models/string_enum_ref'
require 'openapi_client/models/tag'
require 'openapi_client/models/test_query_style_deep_object_explode_true_object_all_of_query_object_parameter'
require 'openapi_client/models/test_query_style_form_explode_true_array_string_query_object_parameter'
require 'openapi_client/models/data_query'

# APIs
require 'openapi_client/api/auth_api'
require 'openapi_client/api/body_api'
require 'openapi_client/api/form_api'
require 'openapi_client/api/header_api'
require 'openapi_client/api/path_api'
require 'openapi_client/api/query_api'

module OpenapiClient
  class << self
    # Customize default settings for the SDK using block.
    #   OpenapiClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
