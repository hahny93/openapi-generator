# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.oneof_with_empty_schema import OneofWithEmptySchema
from unit_test_api import configuration


class TestOneofWithEmptySchema(unittest.TestCase):
    """OneofWithEmptySchema unit test stubs"""
    _configuration = configuration.Configuration()

    def test_both_valid_invalid_fails(self):
        # both valid - invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            OneofWithEmptySchema._from_openapi_data(
                123,
                _configuration=self._configuration
            )

    def test_one_valid_valid_passes(self):
        # one valid - valid
        OneofWithEmptySchema._from_openapi_data(
            "foo",
            _configuration=self._configuration
        )


if __name__ == '__main__':
    unittest.main()