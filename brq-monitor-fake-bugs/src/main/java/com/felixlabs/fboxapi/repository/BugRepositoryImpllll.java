package com.felixlabs.fboxapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.felixlabs.fboxapi.model.Bug;
import com.felixlabs.fboxapi.model.BugItem;


@Controller
public class BugRepository {

	public Bug findAll() {
		
		Bug bugs = new Bug();

		BugItem b1 = new BugItem();
		b1.setDominio("QA_QA");
		b1.setQaProjeto("2019_REGRESSAO_V2");
		b1.setProjeto("10. Rollout 04.08.2019");
		b1.setId("2242");
		b1.setStatus("In Analysis");
		b1.setResponsible("fd.brq.dgalvao");
		b1.setEnvironmentType("PreProd");
		b1.setPriority("3-High");
		b1.setSeverity("3-High");
		b1.setSistemaCorrecao(null);

		BugItem b2 = new BugItem();
		b2.setDominio("QA_QA");
		b2.setQaProjeto("2019_PROJ_FIXA_B2C_V2");
		b2.setProjeto("5252 - Home Assist - Release 1");
		b2.setId("1011");
		b2.setStatus("Open by N1");
		b2.setResponsible("fd.brq.jsilva");
		b2.setEnvironmentType("Esteira 1");
		b2.setPriority("3-High");
		b2.setSeverity("3-High");
		b2.setSistemaCorrecao(null);

		BugItem b3 = new BugItem();
		b3.setDominio("QA_QA");
		b3.setQaProjeto("2019_PROJ_CONV_OSS_FIN_V2");
		b3.setProjeto("3635-Fusion Brasil – Frente Fulfillment Vivo2 - Release 2");
		b3.setId("5425");
		b3.setStatus("In Analysis");
		b3.setResponsible("fd.brq.vjunior");
		b3.setEnvironmentType("Esteira 2");
		b3.setPriority("3-High");
		b3.setSeverity("3-High");
		b3.setSistemaCorrecao(null);

		BugItem b4 = new BugItem();
		b4.setDominio("QA_QA");
		b4.setQaProjeto("2019_PROJ_CONV_OSS_FIN_V2");
		b4.setProjeto("3635-Fusion Brasil – Frente Fulfillment Vivo2 - Release 2");
		b4.setId("5446");
		b4.setStatus("In Analysis");
		b4.setResponsible("fd.brq.vjunior");
		b4.setEnvironmentType("Esteira 2");
		b4.setPriority("3-High");
		b4.setSeverity("3-High");
		b4.setSistemaCorrecao(null);

		BugItem b5 = new BugItem();
		b5.setDominio("QA_QA");
		b5.setQaProjeto("2019_PROJ_CONV_OSS_FIN_V2");
		b5.setProjeto("3635-Fusion Brasil – Frente Fulfillment Vivo2 - Release 2");
		b5.setId("5467");
		b5.setStatus("In Analysis");
		b5.setResponsible("fd.brq.jlima");
		b5.setEnvironmentType("Esteira 2");
		b5.setPriority("3-High");
		b5.setSeverity("3-High");
		b5.setSistemaCorrecao(null);

		BugItem b6 = new BugItem();
		b6.setDominio("QA_QA");
		b6.setQaProjeto("2019_PROJ_CONV_OSS_FIN_V2");
		b6.setProjeto("3635 - Fusion Brasil - Frente B2C Vivo 1 - Release 2");
		b6.setId("5488");
		b6.setStatus("In Analysis");
		b6.setResponsible("fd.brq.integracao");
		b6.setEnvironmentType("Esteira 2");
		b6.setPriority("1-Low");
		b6.setSeverity("1-Low");
		b6.setSistemaCorrecao(null);
		
		List<BugItem> bugList = new ArrayList<BugItem>();
		bugList.add(b1);
		bugList.add(b2);
		bugList.add(b3);
		bugList.add(b4);
		bugList.add(b5);
		bugList.add(b6);
		
		bugs.setBugs(bugList);

		return bugs;
	}

}
