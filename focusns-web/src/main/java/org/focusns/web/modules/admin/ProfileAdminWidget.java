package org.focusns.web.modules.admin;

/*
 * #%L
 * FocusSNS Web
 * %%
 * Copyright (C) 2011 - 2013 FocusSNS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import java.util.List;
import java.util.Map;

import org.focusns.model.core.Project;
import org.focusns.model.core.ProjectAttribute;
import org.focusns.service.core.ProjectAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileAdminWidget {

    @Autowired
    private ProjectAttributeService attributeService;

    public String editLogo(Map<String, Object> model, String sessionId, Project project) {
        //
        // File tmpLogo =
        // RuntimeHelper.getInstance().getTmpProjectLogo(sessionId);
        // model.put("hasTmpLogo", tmpLogo.canRead());
        // //
        // File targetLogo =
        // RuntimeHelper.getInstance().getProjectLogo(project.getId());
        // model.put("hasLogo", targetLogo.canRead());
        //
        return "modules/admin/profile/logo-edit";
    }

    public String editProject(Project project) {
        return "modules/admin/profile/project-edit";
    }

    public String editAttribute(Map<String, Object> model, Project project) {
        //
        List<ProjectAttribute> attributes = attributeService.getProjectAttributes(project.getId());
        model.put("attributes", attributes);
        //
        return "modules/admin/profile/attribute-edit";
    }

}
