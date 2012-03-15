import org.gmetrics.metric.cyclomatic.CyclomaticComplexityMetric

final COBERTURA_FILE = 'file:build/reports/cobertura/coverage.xml'
final FUNCTION_LIST = ['total']

  metricset {
    description 'OCR Bank Kata Metrics'    

    def cyclomaticComplexityMetric = metric(CyclomaticComplexityMetric)

    def coberturaLineMetric = CoberturaLineCoverage {
      coberturaFile = COBERTURA_FILE
      functions = FUNCTION_LIST
      packageNamePrefixes = 'src/main/groovy'
    }

    CoberturaBranchCoverage {
      coberturaFile = COBERTURA_FILE
      functions = FUNCTION_LIST
      packageNamePrefixes = 'src/main/groovy'
    }

    CRAP {
      functions = FUNCTION_LIST
      coverageMetric = coberturaLineMetric
      complexityMetric = cyclomaticComplexityMetric
    }

    ABC {
      functions = FUNCTION_LIST
    }

    ClassLineCount

    MethodLineCount
  }
