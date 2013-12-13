package org.protege.integration.hermit;

import org.protege.editor.owl.model.inference.AbstractProtegeOWLReasonerInfo;
import org.semanticweb.HermiT.Configuration;
import org.semanticweb.HermiT.Reasoner;
import org.semanticweb.owlapi.reasoner.BufferingMode;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor;

public class ProtegeReasonerFactory extends AbstractProtegeOWLReasonerInfo {

	protected final Reasoner.ReasonerFactory factory = new Reasoner.ReasonerFactory();

	@Override
	public OWLReasonerConfiguration getConfiguration(ReasonerProgressMonitor monitor) {
		Configuration configuration = new Configuration();
		configuration.ignoreUnsupportedDatatypes = true;
		configuration.reasonerProgressMonitor = monitor;
		return configuration;
	}

	@Override
	public BufferingMode getRecommendedBuffering() {
		return BufferingMode.BUFFERING;
	}

	@Override
	public OWLReasonerFactory getReasonerFactory() {
		return factory;
	}
}



